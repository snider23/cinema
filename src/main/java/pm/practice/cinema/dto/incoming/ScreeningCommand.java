package pm.practice.cinema.dto.incoming;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class ScreeningCommand {

    private String title;
    private LocalDateTime screeningDate;
    private Integer totalSeats;
    private String pictureUrl;
}
