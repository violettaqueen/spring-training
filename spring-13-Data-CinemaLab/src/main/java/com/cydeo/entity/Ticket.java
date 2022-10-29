package com.cydeo.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Ticket extends BaseEntity{

    @Column(columnDefinition = "TIMESTAMP")
    private LocalDateTime dateTime;

    private Integer seatNumber;
    private Integer rowNumber;

    @ManyToOne(fetch = FetchType.LAZY)
    private MovieCinema movieCinema;

    @ManyToOne(fetch = FetchType.LAZY)
    private User userAccount;

    @Override
    public String toString() {
        return "Ticket{" +
                "seatNumber=" + seatNumber +
                ", rowNumber=" + rowNumber +
                ", dateTime=" + dateTime +
                '}';
    }

}
