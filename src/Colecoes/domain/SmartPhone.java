package Colecoes.domain;

public class SmartPhone {
    private String serialNumber;
    private String marca;

    public SmartPhone(String serialNumber, String marca) {
        this.serialNumber = serialNumber;
        this.marca = marca;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null)return false;
        if (this == obj) return true;
        if (this.getClass() != obj.getClass())return false;
       SmartPhone smartPhone = (SmartPhone) obj;
        return serialNumber != null && serialNumber.equals(smartPhone.serialNumber) && marca != null && marca.equals(smartPhone.marca);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}
