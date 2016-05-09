/*
 * Copyright (c) 2006-2016, The University of Sheffield. See the file
 * COPYRIGHT.txt in the software or at http://gate.ac.uk/gate/COPYRIGHT.txt
 * 
 * This program is free software: you can redistribute it and/or modify it under
 * the terms of the GNU General Public License as published by the Free Software
 * Foundation, either version 3 of the License, or (at your option) any later
 * version.
 * 
 * This program is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU General Public License for more
 * details.
 * 
 * You should have received a copy of the GNU General Public License along with
 * this program. If not, see <http://www.gnu.org/licenses/>.
 *
 *  $Id: DependencyRelation.java 15600 2012-03-19 15:40:56Z adamfunk $
 */
package gate.stanford;

import java.io.Serializable;

/**
 * Simple data structure representing a single dependency relation.  The "target"
 * is the Annotation ID of the dependent; the "type" is the dependency 
 * tag (<a href="http://nlp.stanford.edu/software/parser-faq.shtml#c">the
 * Stanford Parser documentation</a> contains links to the tagset</a>; for example,
 * nsubj = "nominal subject", dobj = "direct object).
 */
public class DependencyRelation implements Serializable {

  private static final long serialVersionUID = -7842607116149222052L;

  /**
   * The type of the dependency relation (det, amod, etc.).
   */
  private String type;
  
  /**
   * The ID of the token that is the target of this relation.
   */
  private Integer targetId;
  
  public DependencyRelation(String type, Integer targetId) {
    this.type = type;
    this.targetId = targetId;
  }

  /**
   * Return the dependency tag (type).
   * @return the dependency tag
   */
  public String getType() {
    return type;
  }

  /**
   * Set the dependency tag.
   * @param type dependency tag
   */
  public void setType(String type) {
    this.type = type;
  }

  /**
   * Return the GATE Annotation ID of the dependent.
   * @return the Annotation ID
   */
  public Integer getTargetId() {
    return targetId;
  }

  /**
   * Set the Annotation ID of the dependent.
   * @param targetId the Annotation ID
   */
  public void setTargetId(Integer targetId) {
    this.targetId = targetId;
  }
  
  /**
   * Format the data structure for display.
   * For example, if type is "dobj" and the dependent has Annotation ID 37,
   * return the String "dobj(37)". 
   */
  public String toString() {
    return type + "(" + targetId + ")";
  }
}
