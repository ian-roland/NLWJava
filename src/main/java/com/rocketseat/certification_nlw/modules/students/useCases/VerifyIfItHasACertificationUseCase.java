package com.rocketseat.certification_nlw.modules.students.useCases;

import org.springframework.stereotype.Service;

import com.rocketseat.certification_nlw.modules.students.dto.verifyCertificationStatusDTO;

@Service
public class VerifyIfItHasACertificationUseCase{
    
    public boolean execute(verifyCertificationStatusDTO dto) {
        if(dto.getEmail().equals("ianrolandnascimento@gmail.com") && dto.getTechnology().equals("JAVA")){
            return true;
        }
        return false;

    }

}
