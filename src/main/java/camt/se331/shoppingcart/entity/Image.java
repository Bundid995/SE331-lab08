package camt.se331.shoppingcart.entity;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by KIMHUN on 3/29/2016.
 */

@Entity
public class Image {
        @Id
        @GeneratedValue
        private Long id;

                String fileName;
        @Lob
        byte[] content;
        String contentType;

                @Temporal(TemporalType.TIME)
                Date created;
    }

