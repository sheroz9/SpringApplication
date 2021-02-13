package org.hotel.proj;

class NotAvailable extends Exception
{
    @Override
    public String toString()
    {
        return "Not Available !";
    }
}