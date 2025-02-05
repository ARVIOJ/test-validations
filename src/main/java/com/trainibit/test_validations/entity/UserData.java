package com.trainibit.test_validations.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.sql.Timestamp;
import java.util.UUID;

@Getter
@Setter
@Entity
public class UserData {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "email", nullable = false)
    private String email;

    @Column(name = "uuid", nullable = false)
    private UUID uuid;

    @Column(name = "template_uuid", nullable = false)
    private UUID templateUuid;

    @Column(name = "token", nullable = false)
    private String Token;

    @Column(name = "create_at", nullable = false)
    @CreationTimestamp
    private Timestamp createdDate;

    @Column(name = "update_at", nullable = false)
    @UpdateTimestamp
    private Timestamp updatedDate;
}
