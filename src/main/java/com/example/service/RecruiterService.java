package com.example.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.DTO.RecruiterDTO;
import com.example.entity.Recruiter;
import com.example.repository.RecruiterRepository;

@Service
public class RecruiterService {

    @Autowired
    private RecruiterRepository recruiterRepository;

    // ✅ Create recruiter
    public RecruiterDTO createRecruiter(RecruiterDTO dto) {
        Recruiter recruiter = new Recruiter(
                dto.id,
                dto.name,
                dto.email,
                dto.phone,
                dto.companyName,
                dto.companyDescription,
                dto.companyWebsite,
                dto.companyAddress,
                dto.companySize,
                dto.designation,
                dto.user
        );

        recruiter = recruiterRepository.save(recruiter);

        return new RecruiterDTO(
                recruiter.getId(),
                recruiter.getName(),
                recruiter.getEmail(),
                recruiter.getPhone(),
                recruiter.getCompanyName(),
                recruiter.getCompanyDescription(),
                recruiter.getCompanyWebsite(),
                recruiter.getCompanyAddress(),
                recruiter.getCompanySize(),
                recruiter.getDesignation(),
                recruiter.getUser()
        );
    }

    // ✅ Get by Email
    public RecruiterDTO getRecruiterByEmail(String email) {
        Recruiter recruiter = recruiterRepository.findByEmail(email);
        if (recruiter == null) return null;

        return new RecruiterDTO(
                recruiter.getId(),
                recruiter.getName(),
                recruiter.getEmail(),
                recruiter.getPhone(),
                recruiter.getCompanyName(),
                recruiter.getCompanyDescription(),
                recruiter.getCompanyWebsite(),
                recruiter.getCompanyAddress(),
                recruiter.getCompanySize(),
                recruiter.getDesignation(),
                null
        );
    }

    // ✅ Get by Id
    public RecruiterDTO getRecruiterById(Long id) {
        Optional<Recruiter> optionalRecruiter = recruiterRepository.findById(id);
        if (!optionalRecruiter.isPresent()) return null;

        Recruiter recruiter = optionalRecruiter.get();
        return new RecruiterDTO(
                recruiter.getId(),
                recruiter.getName(),
                recruiter.getEmail(),
                recruiter.getPhone(),
                recruiter.getCompanyName(),
                recruiter.getCompanyDescription(),
                recruiter.getCompanyWebsite(),
                recruiter.getCompanyAddress(),
                recruiter.getCompanySize(),
                recruiter.getDesignation(),
                null
        );
    }
}
