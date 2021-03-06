package technology.semi.weaviate.client.v1.schema;

import technology.semi.weaviate.client.Config;
import technology.semi.weaviate.client.v1.schema.api.ClassCreator;
import technology.semi.weaviate.client.v1.schema.api.ClassDeleter;
import technology.semi.weaviate.client.v1.schema.api.ClassGetter;
import technology.semi.weaviate.client.v1.schema.api.PropertyCreator;
import technology.semi.weaviate.client.v1.schema.api.SchemaDeleter;
import technology.semi.weaviate.client.v1.schema.api.SchemaGetter;
import technology.semi.weaviate.client.v1.schema.api.ShardUpdater;
import technology.semi.weaviate.client.v1.schema.api.ShardsGetter;
import technology.semi.weaviate.client.v1.schema.api.ShardsUpdater;

public class Schema {
  private final Config config;

  public Schema(Config config) {
    this.config = config;
  }

  public SchemaGetter getter() {
    return new SchemaGetter(config);
  }

  public ClassGetter classGetter() {
    return new ClassGetter(config);
  }

  public ClassCreator classCreator() {
    return new ClassCreator(config);
  }

  public ClassDeleter classDeleter() {
    return new ClassDeleter(config);
  }

  public PropertyCreator propertyCreator() {
    return new PropertyCreator(config);
  }

  public SchemaDeleter allDeleter() {
    return new SchemaDeleter(new SchemaGetter(config), new ClassDeleter(config));
  }

  public ShardsGetter shardsGetter() {
    return new ShardsGetter(config);
  }

  public ShardUpdater shardUpdater() {
    return new ShardUpdater(config);
  }

  public ShardsUpdater shardsUpdater() {
    return new ShardsUpdater(config);
  }
}
