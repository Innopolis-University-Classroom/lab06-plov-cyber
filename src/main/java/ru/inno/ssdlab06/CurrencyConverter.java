package ru.inno.ssdlab06;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class CurrencyConverter {
    public Map<String, Float> currencies = new HashMap<String, Float>() {{
        put("usd", (float)83.5485);
        put("eur", (float)93.5994);
        put("aud", (float)60.0964);
    }};

    public float convert(float value, String from, String to) {
        if (Objects.equals(from, "rouble")) {
            return value / currencies.get("to");
        } else if (Objects.equals(to, "rouble")) {
            return value * currencies.get("from");
        } else {
            return this.convert(this.convert(value, from, "rouble"), "rouble", to);
        }
    }
}

