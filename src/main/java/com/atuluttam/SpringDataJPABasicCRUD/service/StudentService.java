package com.atuluttam.SpringDataJPABasicCRUD.service;

import com.atuluttam.SpringDataJPABasicCRUD.Model.Student;
import com.atuluttam.SpringDataJPABasicCRUD.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {
    @Autowired
    StudentRepository studentRepository;

    public List<Student> getAllStudents(){
       return studentRepository.findAll();
    }

    public Student getStudentById(Long id) {
        return studentRepository.findById(id).orElse(null);
    }

    public Student saveStudent(Student student)
    {
        return studentRepository.save(student);
    }

    public Student updateStudent(Long id, Student student)
    {
        Student st = getStudentById(id);
        if(st!=null)
        {
            st.setAge(student.getAge());
            st.setId(student.getId());
            st.setName(student.getName());
            st.setEmail(student.getEmail());
            return studentRepository.save(st);
        }
        return  null;
    }


    public void deleteStudent(Long id)
    {
        studentRepository.deleteById(id);
    }


}
