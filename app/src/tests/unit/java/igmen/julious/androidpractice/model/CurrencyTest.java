package igmen.julious.androidpractice.model;

import org.junit.Before;
import org.junit.Test;


import static org.assertj.core.api.Assertions.assertThat;

public class CurrencyTest {

    private Currency classUnderTest;

    @Before
    public void setUp() {
        classUnderTest = new Currency("", "", "");
    }

    @Test
    public void constructor() {
        String code = "PHP";
        String name = "Philippine Peso";
        String symbol = "P";

        Currency currency = new Currency(code, name, symbol);
        assertThat(currency.getCode()).isEqualTo(code);
        assertThat(currency.getName()).isEqualTo(name);
        assertThat(currency.getSymbol()).isEqualTo(symbol);
    }

    @Test
    public void codeGetterAndSetter() {
        String expected = "PHP";
        classUnderTest.setCode(expected);
        assertThat(classUnderTest.getCode()).isEqualTo(expected);
    }

    @Test
    public void idGetterAndSetter() {
        long id = 1234L;
        classUnderTest.setId(id);
        assertThat(classUnderTest.getId()).isEqualTo(id);
    }

    @Test
    public void nameGetterAndSetter() {
        String expected = "name";
        classUnderTest.setName(expected);
        assertThat(classUnderTest.getName()).isEqualTo(expected);
    }

    @Test
    public void symbolGetterAndSetter() {
        String expected = "Symbol";
        classUnderTest.setSymbol(expected);
        assertThat(classUnderTest.getSymbol()).isEqualTo(expected);
    }
}