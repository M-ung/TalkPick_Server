package talkPick.domain.topic.domain;

import jakarta.persistence.*;
import lombok.*;
import talkPick.global.model.BaseTime;
import talkPick.global.model.TalkPickStatus;
import talkPick.domain.admin.domain.Admin;

@Getter
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Topic extends BaseTime {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String detail;
    private String thumbnail;
    private String icon;
    private Long categoryId;
    @Enumerated(EnumType.STRING)
    private TalkPickStatus status;

    @ManyToOne(fetch = FetchType.LAZY)
    private Admin createdBy;

    public static Topic create(String title, String detail, String thumbnail, String icon, Admin createdBy) {
        //TODO category_id 넣어줘야 함.
        return Topic.builder()
                .title(title)
                .detail(detail)
                .thumbnail(thumbnail)
                .icon(icon)
                .createdBy(createdBy)
                .status(TalkPickStatus.ACTIVE) // 상태 초기화
                .build();
    }

    public void update(String title, String detail, String thumbnail, String icon) {
        this.title = title;
        this.detail = detail;
        this.thumbnail = thumbnail;
        this.icon = icon;
    }
}