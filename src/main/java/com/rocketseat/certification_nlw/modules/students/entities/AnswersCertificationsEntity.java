package com.rocketseat.certification_nlw.modules.students.entities;

import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data   
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "answers_certification_students")
public class AnswersCertificationsEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @JoinColumn(name="certification_id")
    private UUID certificationID;

    @JoinColumn(name="student_id")
    private UUID studentID;

    @JoinColumn(name="question_id")
    private UUID questionID;

    @JoinColumn(name="answer_id")
    private UUID answerID;


    private boolean isCorrect;

    
}
