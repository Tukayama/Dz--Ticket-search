package ru.netology.repository;

import ru.netology.domain.Tiket;

public class Repository {
    private Tiket[] tikets = new Tiket[0];

    public void add(Tiket tiket) {
        int quantity = tikets.length + 1;
        Tiket[] temp = new Tiket[quantity];
        System.arraycopy(tikets, 0, temp, 0, tikets.length);
        int last = temp.length - 1;
        temp[last] = tiket;
        tikets = temp;
    }

    public Tiket[] findAll() {
        return tikets;
    }

    public void removeById(int id) {
        int quantity = tikets.length + 1;
        Tiket[] temp = new Tiket[quantity];
        int index = 0;
        for (Tiket tiket : tikets) {
            if (tiket.getId() != id) {
                temp[index] = tiket;
                index++;
            }
        }
        tikets = temp;
    }
}
