package com.example.controller;

import com.example.DTO.InvoiceDTO;
import com.example.service.InvoiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/invoices")
@CrossOrigin(origins = "*")
public class InvoiceController {

    @Autowired
    private InvoiceService invoiceService;

    // ✅ Generate invoice from subscription
    @PostMapping("/generate/{subscriptionId}")
    public ResponseEntity<InvoiceDTO> generateInvoice(
            @PathVariable Long subscriptionId,
            @RequestParam String userEmail,
            @RequestParam String paymentMethod) {

        InvoiceDTO dto = invoiceService.generateInvoice(subscriptionId, userEmail, paymentMethod);
        return ResponseEntity.ok(dto);
    }

    // ✅ Save invoice directly using DTO
    @PostMapping
    public ResponseEntity<InvoiceDTO> saveInvoice(@RequestBody InvoiceDTO dto) {
        return ResponseEntity.ok(invoiceService.saveInvoice(dto));
    }

    // ✅ Get all invoices
    @GetMapping
    public ResponseEntity<List<InvoiceDTO>> getAllInvoices() {
        return ResponseEntity.ok(invoiceService.getAllInvoices());
    }

    // ✅ Get invoice by ID
    @GetMapping("/{id}")
    public ResponseEntity<InvoiceDTO> getInvoiceById(@PathVariable Long id) {
        InvoiceDTO dto = invoiceService.getInvoiceById(id);
        return dto != null ? ResponseEntity.ok(dto) : ResponseEntity.notFound().build();
    }

    // ✅ Download invoice as PDF
    @GetMapping("/download/{id}")
    public ResponseEntity<byte[]> downloadInvoicePdf(@PathVariable Long id) {
        byte[] pdf = invoiceService.downloadInvoicePdf(id);

        return ResponseEntity.ok()
                .header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=invoice_" + id + ".pdf")
                .contentType(MediaType.APPLICATION_PDF)
                .body(pdf);
    }

    // ✅ Delete invoice
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteInvoice(@PathVariable Long id) {
        boolean deleted = invoiceService.deleteInvoice(id);
        return deleted ? ResponseEntity.noContent().build() : ResponseEntity.notFound().build();
    }
}