package tesok.kr.whiteship;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.Date;

public class Book {

    @NotEmpty
    private String name;
    @NotNull
    @Min(0)
    private Integer price;
    @NotNull
    private Date  pub;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Date getPub() {
        return pub;
    }

    public void setPub(Date pub) {
        this.pub = pub;
    }
}
