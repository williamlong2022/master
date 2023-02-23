import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
public final class Product{
    private final int id;
    private final String name ;
    private final BigDecimal price;
    private final List<String> intemlocation;

    public Product(int id, String name, BigDecimal price, List<String> intemlocation) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.intemlocation = new ArrayList<>(intemlocation);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public List<String> getIntemlocation() {
        return new ArrayList<>(intemlocation);
    }
}

