package com.client.ws.wsapi.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serial;
import java.io.Serializable;
import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class SubscriptionTypeDto implements Serializable {

    @Serial
    private static final long serialVersionUID = -8057951314910379629L;

    private Long id;
    private String name;
    private Long accessMonth;
    private BigDecimal price;
    private String productKey;
}
