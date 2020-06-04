import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CheckTest {
    private Check check;

    CheckTest() {
    }

    @BeforeEach
    void setUp() {
        this.check = new Check();
    }

    @Test
    void allCheck() {

        for(CollectionOfStates state:CollectionOfStates.values()) {
            System.out.print(state + " ");
            if (state != CheckTest.CollectionOfStates.fftt && state != CheckTest.CollectionOfStates.ttff && state != CheckTest.CollectionOfStates.fttf && state != CheckTest.CollectionOfStates.tfft && state != CheckTest.CollectionOfStates.tftf && state != CheckTest.CollectionOfStates.ftft) {
                this.checkFalse(state.a, state.b, state.c, state.d);
            } else {
                this.checkTrue(state.a, state.b, state.c, state.d);
            }
        }

        System.out.println("Все тесты пройдены успешно");
    }

    private void checkTrue(boolean a, boolean b, boolean c, boolean d) {
        boolean returnBolean = this.check.checkOneLine(a, b, c, d);
        System.out.println(returnBolean);
        Assertions.assertTrue(returnBolean);
    }

    private void checkFalse(boolean a, boolean b, boolean c, boolean d) {
        boolean returnBolean = this.check.checkOneLine(a, b, c, d);
        System.out.println(returnBolean);
        Assertions.assertFalse(returnBolean);
    }

    enum CollectionOfStates {
        ffff(false, false, false, false),
        ffft(false, false, false, true),
        fftf(false, false, true, false),
        fftt(false, false, true, true),
        ftff(false, true, false, false),
        ftft(false, true, false, true),
        fttf(false, true, true, false),
        fttt(false, true, true, true),
        tfff(true, false, false, false),
        tfft(true, false, false, true),
        tftf(true, false, true, false),
        tftt(true, false, true, true),
        ttff(true, true, false, false),
        ttft(true, true, false, true),
        tttf(true, true, true, false),
        tttt(true, true, true, true);

        private boolean a;
        private boolean b;
        private boolean c;
        private boolean d;

        CollectionOfStates(boolean a, boolean b, boolean c, boolean d) {
            this.a = a;
            this.b = b;
            this.c = c;
            this.d = d;
        }

        public boolean isA() {
            return this.a;
        }

        public boolean isB() {
            return this.b;
        }

        public boolean isC() {
            return this.c;
        }

        public boolean isD() {
            return this.d;
        }
    }
}