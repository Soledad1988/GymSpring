package com.spring.gym.model;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity(name="Routine")
@Table(name="routines")
public class Routine {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer idRoutine;
    
    String dayOfWeek;  // Día de la semana, e.g., "Monday"
    String exerciseType;  // Tipo de ejercicio, e.g., "Cardio", "Strength Training"
    int duration;  // Duración en minutos
    int intensityLevel;  // Nivel de intensidad, e.g., 1-5
    
    @ManyToOne
    @JoinColumn(name = "category_id")
    @JsonBackReference
    private Category category;
    
    // Constructores
    public Routine() {
        
    }

    public Routine(Integer idRoutine, String dayOfWeek, String exerciseType, int duration, int intensityLevel, Category category) {
        super();
        this.idRoutine = idRoutine;
        this.dayOfWeek = dayOfWeek;
        this.exerciseType = exerciseType;
        this.duration = duration;
        this.intensityLevel = intensityLevel;
        this.category = category;
    }
    
    // Getters y Setters
    public Integer getIdRoutine() {
        return idRoutine;
    }

    public void setIdRoutine(Integer idRoutine) {
        this.idRoutine = idRoutine;
    }


    public String getDayOfWeek() {
        return dayOfWeek;
    }

    public void setDayOfWeek(String dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }

    public String getExerciseType() {
        return exerciseType;
    }

    public void setExerciseType(String exerciseType) {
        this.exerciseType = exerciseType;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getIntensityLevel() {
        return intensityLevel;
    }

    public void setIntensityLevel(int intensityLevel) {
        this.intensityLevel = intensityLevel;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}