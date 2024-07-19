package com.bitam.Telemedicine.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Appointment {
    @Id
    @GeneratedValue
    private Integer id;
    private String FullName;
    private String PatientEmail;
    private String date;
    private String age;
    private String gender;
    private LocalDateTime timeIn;
    private LocalDateTime timeOut;
}
