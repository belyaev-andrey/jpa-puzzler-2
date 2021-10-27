# JPA Puzzler 2 - *ToOne Relations

This puzzler shows the case with OneToOne eager references. You can try to set `LAZY` fetch type for One-To-One reference to 
`Collar` entity with a non-owning side. You can be sure that it won't help. 

For this case you can try to uncomment bytecode enhancement plugin and use Hibernate's annotation

```java
    @LazyToOne(LazyToOneOption.NO_PROXY)
    @OneToOne(mappedBy = "pet", fetch = FetchType.LAZY, optional = false)
    private Collar collar;
```
The next option - move join column from `Collar` entity to `Pet` entity.

Another option - use [Vlad Mihalcea's article](https://vladmihalcea.com/the-best-way-to-map-a-onetoone-relationship-with-jpa-and-hibernate/).