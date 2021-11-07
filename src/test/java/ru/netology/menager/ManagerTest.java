package ru.netology.menager;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.domain.Tiket;

import static org.junit.jupiter.api.Assertions.*;

class ManagerTest {
    private Manager manager = new Manager();
    private Tiket tik1 = new Tiket(1, 1299, "SVO", "KZN", 95);
    private Tiket tik2 = new Tiket(2, 2940, "DME", "SIP", 155);
    private Tiket tik3 = new Tiket(3, 2199, "VKO", "VOG", 95);

    @BeforeEach
    public void list() {
        manager.save(tik1);
        manager.save(tik2);
        manager.save(tik3);
    }

    @Test
    public void searchByFrom() {
        Tiket[] expented = new Tiket[]{tik1};
        Tiket[] actual = manager.search("SVO", " ");
        assertArrayEquals(expented, actual);
    }

    @Test
    public void serchByTo() {
        Tiket[] expented = new Tiket[]{tik2};
        Tiket[] actual = manager.search(" ", "SIP");
        assertArrayEquals(expented, actual);
    }

    @Test
    public void searchBy() {
        Tiket[] expented = new Tiket[]{};
        Tiket[] actual = manager.search("", "");
        assertArrayEquals(expented, actual);
    }


    @Test
    void searchFrom() {
        Tiket[] expented = new Tiket[]{};
        Tiket[] actual = manager.search("SIP","VKO" );
        assertArrayEquals(expented, actual);
    }
    }



