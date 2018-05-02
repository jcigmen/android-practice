package igmen.julious.androidpractice.model;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.NonNull;

@Entity(tableName = Currency.TABLE_NAME)
public class Currency {

    public static final String TABLE_NAME = "currencies";

    @NonNull
    private String code;

    @PrimaryKey
    private long id;

    @NonNull
    private String name;

    @NonNull
    private String symbol;

    public Currency(@NonNull String code, @NonNull String name, @NonNull String symbol) {
        this.code = code;
        this.name = name;
        this.symbol = symbol;
    }

    @NonNull
    public String getCode() {
        return code;
    }

    @NonNull
    public String getName() {
        return name;
    }

    public long getId() {
        return id;
    }

    @NonNull
    public String getSymbol() {
        return symbol;
    }

    public void setCode(@NonNull String code) {
        this.code = code;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setName(@NonNull String name) {
        this.name = name;
    }

    public void setSymbol(@NonNull String symbol) {
        this.symbol = symbol;
    }
}
