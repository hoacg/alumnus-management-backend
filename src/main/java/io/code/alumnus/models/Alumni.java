package io.code.alumnus.models;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Alumni {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String fullname;
    private String jobtitle;

    @Column(columnDefinition = "TEXT")
    private String notes;
}
