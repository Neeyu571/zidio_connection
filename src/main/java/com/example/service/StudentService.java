package com.example.service;

import com.example.DTO.StudentDTO;
import com.example.entity.Student;
import com.example.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    // Convert Entity -> DTO
    private StudentDTO convertToDTO(Student student) {
        return new StudentDTO(
                student.getId(),
                student.getName(),
                student.getEmail(),
                student.getPhone(),
                student.getQualification(),
                student.getResumeURL(),
                student.getSkills(),
                student.getGithubURL(),
                student.getLinkedinURL(),
                student.getExperienceLevel(),
                student.getGender(),
                student.getGraduationYear(),
                student.getPreferredJobLocations(),
                student.getExpectedSalary(),
                student.getNoticePeriod(),
                student.getProjects(),
                null
        );
    }

    // Convert DTO -> Entity
    private Student convertToEntity(StudentDTO dto) {
        return new Student(
                dto.getId(),
                dto.getName(),
                dto.getEmail(),
                dto.getPhone(),
                dto.getQualification(),
                dto.getResumeURL(),
                dto.getSkills(),
                dto.getGithubURL(),
                dto.getLinkedinURL(),
                dto.getExperienceLevel(),
                dto.getGender(),
                dto.getGraduationYear(),
                dto.getPreferredJobLocations(),
                dto.getExpectedSalary(),
                dto.getNoticePeriod(),
                dto.getProjects(),
                dto.getUser()
        );
    }

    // Create Student (renamed from saveStudent)
    public StudentDTO createStudent(StudentDTO studentDTO) {
        Student student = convertToEntity(studentDTO);
        return convertToDTO(studentRepository.save(student));
    }

    // Get All Students
    public List<StudentDTO> getAllStudents() {
        return studentRepository.findAll()
                .stream()
                .map(this::convertToDTO)
                .collect(Collectors.toList());
    }

    // Get Student by ID (return StudentDTO instead of Optional)
    public StudentDTO getStudentById(Long id) {
        return studentRepository.findById(id)
                .map(this::convertToDTO)
                .orElseThrow(() -> new RuntimeException("Student not found with ID: " + id));
    }

    // ✅ NEW: Get Student by Email
    public StudentDTO getStudentByEmail(String email) {
        return studentRepository.findByEmail(email)
                .map(this::convertToDTO)
                .orElseThrow(() -> new RuntimeException("Student not found with email: " + email));
    }

    // Update Student
    public StudentDTO updateStudent(Long id, StudentDTO studentDTO) {
        return studentRepository.findById(id).map(student -> {
            student.setName(studentDTO.getName());
            student.setEmail(studentDTO.getEmail());
            student.setPhone(studentDTO.getPhone());
            student.setQualification(studentDTO.getQualification());
            student.setResumeURL(studentDTO.getResumeURL());
            student.setSkills(studentDTO.getSkills());
            student.setGithubURL(studentDTO.getGithubURL());
            student.setLinkedinURL(studentDTO.getLinkedinURL());
            student.setExperienceLevel(studentDTO.getExperienceLevel());
            student.setGender(studentDTO.getGender());
            student.setGraduationYear(studentDTO.getGraduationYear());
            student.setPreferredJobLocations(studentDTO.getPreferredJobLocations());
            student.setExpectedSalary(studentDTO.getExpectedSalary());
            student.setNoticePeriod(studentDTO.getNoticePeriod());
            student.setProjects(studentDTO.getProjects());
            student.setUser(studentDTO.getUser());
            return convertToDTO(studentRepository.save(student));
        }).orElseThrow(() -> new RuntimeException("Student not found with ID: " + id));
    }

    // Delete Student
    public void deleteStudent(Long id) {
        studentRepository.deleteById(id);
    }
}
