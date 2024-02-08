package com.rocketseat.certification_nlw.modules.students.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rocketseat.certification_nlw.modules.students.dto.verifyCertificationStatusDTO;
import com.rocketseat.certification_nlw.modules.students.useCases.VerifyIfItHasACertificationUseCase;

@RestController
@RequestMapping("/students")
public class studentController {

        // Necessário Utilizar o USECASE

        @Autowired
        private VerifyIfItHasACertificationUseCase verifyIfItHasACertificationUseCase;



    @PostMapping("/verifyIfItHasACertification")
    public String verifyIfItHasACertification(@RequestBody verifyCertificationStatusDTO verifyCertificationStatusDTO){

        //Receberá o Email e a tecnologia escolhida para a certificação

        var result = this.verifyIfItHasACertificationUseCase.execute(verifyCertificationStatusDTO);
        if(result){
            return "Usuário já fez a prova";
        }
        return "Usuário pode fazer a prova";

    }
    
}
