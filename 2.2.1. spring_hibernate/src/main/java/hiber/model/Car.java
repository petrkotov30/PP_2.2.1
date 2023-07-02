package hiber.model;

import javax.persistence.*;

@Entity
@Table(name = "cars")
public
class Car {
    public Car(String model,int series) {
        this.model = model;
        this.series = series;
    }
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "car_id")
    private Long id;
    @Column(name = "model")
    private String model;
    @Column(name = "series")
    private int series;

    public Car() {

    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Car = {" +
                "model='" + model + '\'' +
                ", series=" + series +
                '}';
    }

    public Long getId() {
        return id;
    }
}
