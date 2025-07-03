package talkPick.domain.topic.domain;

import jakarta.persistence.*;
import lombok.*;
import talkPick.domain.topic.domain.type.Keyword;
import talkPick.global.model.BaseTime;

@Getter
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class TopicKeyword extends BaseTime {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long topicId;
    @Enumerated(EnumType.STRING)
    private Keyword keyword;
}