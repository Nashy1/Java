package com.gmail.nashnyembe0902.payroll;

//Represents the Address of an employee.
    public class Address implements Cloneable
    {
        //instance var:
        public String street;
        public String city;
        public String state;
        public String zipCode;public String getStreet() {
        return street;
    }

        public void setStreet(String street) {
            this.street = street;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public String getState() {
            return state;
        }

        public void setState(String state) {
            this.state = state;
        }

        public String getZipCode() {
            return zipCode;
        }

        public void setZipCode(String zipCode) {
            this.zipCode = zipCode;
        }



    }
