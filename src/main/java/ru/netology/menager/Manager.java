package ru.netology.menager;

import ru.netology.domain.Tiket;
import ru.netology.repository.Repository;

import java.util.Arrays;

public class Manager {
    Repository repositoryM = new Repository();

    public void save(Tiket tiket) {
        repositoryM.add(tiket);
    }

    public Tiket[] search(String from, String to) {
        Tiket[] result = new Tiket[0];
        for (Tiket tik : repositoryM.findAll()) {
            Tiket[] temp = new Tiket[result.length + 1];
            if (tik.getAirortFrom().equals(from) || tik.getAirportTo().equals(to)) {
                System.arraycopy(result, 0, temp, 0, result.length);
                temp[temp.length - 1] = tik;
                result = temp;
            }
        }
        Arrays.sort(result);
        return result;
    }

}
