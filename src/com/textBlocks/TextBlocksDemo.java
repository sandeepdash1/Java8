package com.textBlocks;

public class TextBlocksDemo {

    public static void main(String[] args) {

        String html = """
                <html>
                    <head>
                        <title>Page Title</title>
                    </head>
                    <body>       
                        <h1>This is a Heading</h1>
                        <p>This is a paragraph.</p>
                    </body>
                </html>
                """;
        String json = """
                {
                     OrderID: 10248,
                     CustomerName: 'Vinet',
                   },
                   {
                     OrderID: 345653,
                     CustomerName: 'Carson Darrin',
                   }
                """;
        String sql = """
                create table instructor
                    (ID         varchar(5),
                     name           varchar(20) not null,
                     dept_name      varchar(20),
                     salary         numeric(8,2) check (salary > 29000),
                     primary key (ID),
                     foreign key (dept_name) references department(dept_name)
                        on delete set null
                    ) ENGINE = INNODB;
                """;
        System.out.println("textBlock HTML: " + html);
        System.out.println("textBlock JSON: " + json);
        System.out.println("textBlock SQL: " + sql);
    }
}
