package clases;

public class SmartDevice {
    protected long imei;
    protected String marca;
    protected String modelo;

    public SmartDevice() {
    }

    public SmartDevice(long imei, String marca, String modelo) {
        this.imei = imei;
        this.marca = marca;
        this.modelo = modelo;
    }
}

