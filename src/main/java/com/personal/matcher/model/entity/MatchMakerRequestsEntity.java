package com.personal.matcher.model.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import javax.persistence.*;
import javax.persistence.criteria.CriteriaBuilder;
import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@EnableJpaAuditing
@Table(name = "match_maker_requests")
public class MatchMakerRequestsEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "request_id", nullable = false)
    private String requestId;

    @Column(name = "user_id", nullable = false)
    private String userId;

    @Column(name = "game_preferences_id", nullable = false)
    private Integer gamePreferencesId;

    @Column(name = "requested_at", nullable = false)
    private Date requestedAt;

    @Column(name = "status")
    private Boolean status;
}
