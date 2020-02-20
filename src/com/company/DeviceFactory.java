package com.company;


public class DeviceFactory {

    enum DeviceEnum {
        TV {
            public ElectronicDevice returnClass() {
                return new Television();
            }
        },
        FAN {
            public ElectronicDevice returnClass() {
                return new CeilingFan();
            }
        };

        public abstract ElectronicDevice returnClass();

    }

    public static ElectronicDevice getDevice(DeviceEnum deviceEnum) {
        return deviceEnum.returnClass();
    }
}
