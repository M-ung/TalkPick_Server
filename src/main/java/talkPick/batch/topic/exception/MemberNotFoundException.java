package talkPick.batch.topic.exception;

import talkPick.global.exception.ErrorCode;
import talkPick.global.exception.TalkPickException;

public class MemberNotFoundException extends TalkPickException {
    public MemberNotFoundException(final ErrorCode errorCode) {
      super(errorCode);
    }

    public static class MemberLikedTopicsNotFoundException extends RuntimeException {
        public MemberLikedTopicsNotFoundException(String message) {
            super(message);
        }
    }
}