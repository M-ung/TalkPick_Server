package talkPick.domain.random.adapter.out.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import talkPick.domain.random.domain.RandomTopicHistory;

public interface SelectedRandomTopicJpaRepository extends JpaRepository<RandomTopicHistory, Long> {
}
