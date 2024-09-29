package com.cv.s01coreservice.entity;

import com.cv.s01coreservice.entity.generic.GenericEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;
import lombok.experimental.SuperBuilder;
import org.hibernate.proxy.HibernateProxy;

import java.io.Serial;
import java.io.Serializable;
import java.util.Objects;

@Getter
@Setter
@RequiredArgsConstructor
@AllArgsConstructor
@SuperBuilder
@ToString(callSuper = true)
@Entity
public class Menu extends GenericEntity implements Serializable {

    @Serial
    private static final long serialVersionUID = 7400625511096934266L;

    @NotBlank(message = "app.error.msg-1")
    @NotNull(message = "app.error.msg-2")
    @Column(unique = true)
    private String menuName;

    @NotBlank(message = "app.error.msg-1")
    @NotNull(message = "app.error.msg-2")
    @Column(unique = true)
    private String path;

    @NotBlank(message = "app.error.msg-1")
    @NotNull(message = "app.error.msg-2")
    @Column
    private String icon;

    @NotNull(message = "app.error.msg-2")
    @Column
    private Boolean isParent;

    @NotNull(message = "app.error.msg-2")
    @Column
    private Integer order;

    @Override
    public final boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        Class<?> oEffectiveClass = o instanceof HibernateProxy ? ((HibernateProxy) o).getHibernateLazyInitializer().getPersistentClass() : o.getClass();
        Class<?> thisEffectiveClass = this instanceof HibernateProxy ? ((HibernateProxy) this).getHibernateLazyInitializer().getPersistentClass() : this.getClass();
        if (thisEffectiveClass != oEffectiveClass) return false;
        Menu menu = (Menu) o;
        return getId() != null && Objects.equals(getId(), menu.getId());
    }

    @Override
    public final int hashCode() {
        return this instanceof HibernateProxy ? ((HibernateProxy) this).getHibernateLazyInitializer().getPersistentClass().hashCode() : getClass().hashCode();
    }
}
