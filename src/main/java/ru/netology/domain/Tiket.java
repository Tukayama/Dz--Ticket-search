package ru.netology.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Tiket implements Comparable<Tiket> {
    private int id;
    private int price;
    private String airortFrom;
    private String airportTo;
    private int travelTime;

    @Override
    public int compareTo(Tiket o) {
        return (int) (price -o.price );
    }
}
