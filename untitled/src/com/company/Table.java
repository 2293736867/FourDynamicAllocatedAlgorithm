package com.company;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
public class Table {
    @Getter
    @Setter
    private int address;
    @Setter
    @Getter
    private int size;
    private boolean free;
    @Getter
    @Setter
    private boolean lastAllocated;

    public static Table freeTable(int address,int size)
    {
        return new Table(address,size,true,false);
    }

    public static Table allocatedTable(int address,int size)
    {
        return new Table(address,size,false,false);
    }

    public boolean isFree()
    {
        return free;
    }

    public boolean isAllocated()
    {
        return !isFree();
    }

    public void setFree()
    {
        free = true;
    }
}
