package org.kongji.api;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author kong-ji
 * @version 1.0
 * @data 2025/4/7
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class User implements Serializable {
    private static final long serialVersionUID = 1L;

    private Long id;

    private String username;


}
