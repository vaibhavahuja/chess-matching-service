package com.personal.matcher.model.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@EnableJpaAuditing
@Table(name = "game_preferences")
public class GamePreferencesEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "current_rating", nullable = false)
    private Integer currentRating;

    @Column(name = "min_rating", nullable = false)
    private Integer minRating;

    @Column(name = "max_rating", nullable = false)
    private Integer maxRating;

    @Column(name = "color", nullable = false)
    private String color;

    @Column(name = "game_type_id", nullable = false)
    private Integer gameTypeId;
}
