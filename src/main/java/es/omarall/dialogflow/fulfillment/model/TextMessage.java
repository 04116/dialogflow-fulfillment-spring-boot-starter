package es.omarall.dialogflow.fulfillment.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
@Builder
public class TextMessage {
    private List<String> text;
}
