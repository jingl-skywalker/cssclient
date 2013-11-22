/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package njuseaurora.cssclient.po.framepo;

import njuseaurora.cssclient.businesslogic.framebl.Block;

/**
 *
 * @author Administrator
 */
public class BlockPO {

    private String name;
    private String description;
    private int upper;
    private int lower;

    public BlockPO(String name, String description, int upper, int lower) {
        this.name = name;
        this.description = description;
        this.upper = upper;
        this.lower = lower;
    }
    public BlockPO(Block b)
    {
        this(b.getName(), b.getDescription(), b.getUpper(), b.getLower());
    }

    public String getName() {
        return this.name;
    }

    public String getDescription() {
        return this.description;
    }

    public int getLower() {
        return this.lower;
    }

    public int getUpper() {
        return this.lower;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String des) {
        this.description = des;
    }

    public void setLower(int lower) {
        this.lower = lower;
    }

    public void setUpper(int upper) {
        this.upper = upper;
    }
}
