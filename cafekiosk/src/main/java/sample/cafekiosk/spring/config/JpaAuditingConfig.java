package sample.cafekiosk.spring.config;

import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.stereotype.Component;

@EnableJpaAuditing
@Component
public class JpaAuditingConfig {
}
