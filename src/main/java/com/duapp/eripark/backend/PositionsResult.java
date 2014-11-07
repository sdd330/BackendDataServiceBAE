package com.duapp.eripark.backend;

import java.util.List;

public class PositionsResult extends DataResult {
	private List<Position> positions;

    /**
     * @return Returns the categoryEntries.
     */
    public List<Position> getPositions() {
        return positions;
    }

    /**
     * @param categoryEntries The categoryEntries to set.
     */
    public void setPositions(List<Position> positions) {
        this.positions = positions;
    }
}
