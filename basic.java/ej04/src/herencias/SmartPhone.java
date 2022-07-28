package herencias;

import clases.SmartDevice;

public class SmartPhone extends SmartDevice {
    public long imeiCelular;
    public int capacidad;
    public int ram;

    public SmartPhone() {
    }


    public SmartPhone(long imei, String marca, String modelo, long imeiCelular, int capacidad, int ram) {
        super(imei, marca, modelo);
        this.imeiCelular = imeiCelular;
        this.capacidad = capacidad;
        this.ram = ram;
    }
}
