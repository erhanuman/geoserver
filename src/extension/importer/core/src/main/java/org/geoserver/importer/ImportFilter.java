/* (c) 2014 Open Source Geospatial Foundation - all rights reserved
 * (c) 2001 - 2013 OpenPlans
 * This code is licensed under the GPL 2.0 license, available at the root
 * application directory.
 */
package org.geoserver.importer;

public interface ImportFilter {

    static ImportFilter ALL = new ImportFilter() {
        public boolean include(ImportTask task) {
            return true;
        }
    };

    boolean include(ImportTask task);
}
