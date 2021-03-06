package org.echosoft.framework.reports.model;

import java.io.Serializable;

/**
 * Содержит величины отступов по краям листа (измеряется в дюймах).
 *
 * @author Anton Sharapov
 */
public class MarginsModel implements Serializable, Cloneable {

    private double top;
    private double right;
    private double bottom;
    private double left;

    public MarginsModel() {
        this.top = 1.0;
        this.right = 0.75;
        this.bottom = 1.0;
        this.left = 0.75;
    }

    public MarginsModel(final double margins) {
        this.top = margins;
        this.right = margins;
        this.bottom = margins;
        this.left = margins;
    }

    public MarginsModel(final double top, final double right, final double bottom, final double left) {
        this.top = top;
        this.right = right;
        this.bottom = bottom;
        this.left = left;
    }

    public double getTop() {
        return top;
    }
    public void setTop(final double top) {
        this.top = top;
    }

    public double getRight() {
        return right;
    }
    public void setRight(final double right) {
        this.right = right;
    }

    public double getBottom() {
        return bottom;
    }
    public void setBottom(final double bottom) {
        this.bottom = bottom;
    }

    public double getLeft() {
        return left;
    }
    public void setLeft(final double left) {
        this.left = left;
    }

    @Override
    public int hashCode() {
        long bits = Double.doubleToLongBits(top);
        bits += Double.doubleToLongBits(right) * 37;
        bits += Double.doubleToLongBits(bottom) * 43;
        bits += Double.doubleToLongBits(left) * 47;
        return (((int) bits) ^ ((int) (bits >> 32)));
    }

    @Override
    public boolean equals(final Object obj) {
        if (obj == null || !getClass().equals(obj.getClass()))
            return false;
        final MarginsModel other = (MarginsModel) obj;
        return top == other.top &&
                right == other.right &&
                bottom == other.bottom &&
                left == other.bottom;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "[Margins{top:" + top + ", right:" + right + ", bottom:" + bottom + ", left:" + left + "}]";
    }
}
