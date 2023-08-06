package com.cq.core.boot.file;

import com.cq.core.boot.commons.annotation.FieldDesc;
import com.cq.core.boot.jpa.support.BaseJpaAggregate;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.Instant;
import java.util.Map;

/**
 * 文件元数据
 *
 * @author <a href="mailto:cqmike0315@gmail.com">chenqi</a>
 * @version 1.0
 */
@EqualsAndHashCode(callSuper = true)
@Table(name = "t_file_meta")
@Entity
@Data
public class FileMeta extends BaseJpaAggregate {

    @FieldDesc(name = "业务方")
    private String fileName;

    @FieldDesc(name = "展示文件名")
    private String displayName;

    @FieldDesc(name = "文件大小")
    private Long fileSize;

    @FieldDesc(name = "文件类型")
    private String fileType;

    @FieldDesc(name = "文件校验和")
    private String fileCheckSum;

    @FieldDesc(name = "业务方")
    private String supplier;

    @FieldDesc(name = "属主层级1")
    private String levelOne;

    @FieldDesc(name = "属主层级2")
    private String levelTwo;

    @FieldDesc(name = "属主层级3")
    private String levelThree;

    @FieldDesc(name = "外部文件ID")
    private String externalFileId;

    @FieldDesc(name = "存储标签")
    private String objectStorageTag;

    @FieldDesc(name = "存储类型")
    private String objectStorageType;

    @FieldDesc(name = "对象存储端点")
    private String objectStorageEndpoint;

    @FieldDesc(name = "对象存储桶")
    private String objectStorageBucket;
    @FieldDesc(name = "文件路径")
    private String objectStoragePath;
    @FieldDesc(name = "文件加密类型")
    private String objectStorageEncryption;
    @FieldDesc(name = "对象存储桶访问级别")
    private String objectStorageVisibility;
    @FieldDesc(name = "过期时间")
    private Instant expireAt;
    @FieldDesc(name = "扩展信息")
    private Map<String, Object> extra;


}
