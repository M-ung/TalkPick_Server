package talkPick.domain.topic.port.in;

import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Slice;
import talkPick.domain.topic.adapter.in.dto.TopicReqDTO;
import talkPick.domain.topic.adapter.out.dto.TopicResDTO;
import java.util.List;

public interface TopicQueryUseCase {
    Slice<TopicResDTO.Categories> getCategories(Pageable pageable);
    List<TopicResDTO.TopicSummaries> getTodayTopicSummaries(Long userId);
    List<TopicResDTO.TopicDetail> getTodayTopicDetails(TopicReqDTO.TodayTopics requestDTO);
    TopicResDTO.TopicDetail getTopicDetail(Long topicId);
}