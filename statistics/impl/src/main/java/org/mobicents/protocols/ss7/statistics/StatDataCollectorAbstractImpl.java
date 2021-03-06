/*
 * TeleStax, Open Source Cloud Communications
 * Copyright 2011-2013, Telestax Inc and individual contributors
 * by the @authors tag.
 *
 * This program is free software: you can redistribute it and/or modify
 * under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation; either version 3 of
 * the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>
 */
package org.mobicents.protocols.ss7.statistics;

import java.util.Date;

import org.mobicents.protocols.ss7.statistics.api.StatDataCollectorType;
import org.mobicents.protocols.ss7.statistics.api.StatResult;

/**
*
* @author sergey vetyutnev
*
*/
public abstract class StatDataCollectorAbstractImpl implements StatDataCollector {

    private String campaignName;
    protected Date sessionStartTime = new Date();

    public StatDataCollectorAbstractImpl(String campaignName) {
        this.campaignName = campaignName;
    }

    public String getCampaignName() {
        return campaignName;
    }

    public Date getSessionStartTime() {
        return sessionStartTime;
    }

    public abstract StatResult restartAndGet();

    protected abstract void reset();

    public abstract void updateData(long newVal);

    public abstract void updateData(String newVal);

    public abstract StatDataCollectorType getStatDataCollectorType();

}
