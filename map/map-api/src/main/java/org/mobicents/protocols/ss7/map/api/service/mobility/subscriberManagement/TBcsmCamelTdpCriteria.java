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

package org.mobicents.protocols.ss7.map.api.service.mobility.subscriberManagement;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 T-BCSM-CAMEL-TDP-Criteria ::= SEQUENCE { t-BCSM-TriggerDetectionPoint T-BcsmTriggerDetectionPoint, basicServiceCriteria [0]
 * BasicServiceCriteria OPTIONAL, t-CauseValueCriteria [1] T-CauseValueCriteria OPTIONAL, ... }
 *
 * BasicServiceCriteria ::= SEQUENCE SIZE(1..5) OF Ext-BasicServiceCode
 *
 * T-CauseValueCriteria ::= SEQUENCE SIZE(1..5) OF CauseValue
 *
 *
 *
 * @author sergey vetyutnev
 *
 */
public interface TBcsmCamelTdpCriteria extends Serializable {

    TBcsmTriggerDetectionPoint getTBcsmTriggerDetectionPoint();

    ArrayList<ExtBasicServiceCode> getBasicServiceCriteria();

    ArrayList<CauseValue> getTCauseValueCriteria();

}
