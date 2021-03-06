package no.runsafe.framework.internal.database;

import com.google.common.base.Function;
import com.google.common.collect.Lists;
import no.runsafe.framework.api.ILocation;
import no.runsafe.framework.api.IWorld;
import no.runsafe.framework.api.database.IQueryExecutor;
import no.runsafe.framework.api.database.IRow;
import no.runsafe.framework.api.database.IValue;
import no.runsafe.framework.api.player.IPlayer;
import org.joda.time.DateTime;

import javax.annotation.Nullable;
import java.util.List;

@SuppressWarnings("AnonymousInnerClass")
public abstract class QueryExecutorBase implements IQueryExecutor
{
	@Override
	public List<String> queryStrings(String query, Object... params)
	{
		return Lists.transform(
			queryColumn(query, params),
			new Function<IValue, String>()
			{
				@Override
				public String apply(@Nullable IValue value)
				{
					assert value != null;
					return value.String();
				}
			}
		);
	}

	@Override
	public List<Integer> queryIntegers(String query, Object... params)
	{
		return Lists.transform(
			queryColumn(query, params),
			new Function<IValue, Integer>()
			{
				@Override
				public Integer apply(@Nullable IValue value)
				{
					assert value != null;
					return value.Integer();
				}
			}
		);
	}

	@Override
	public List<Long> queryLongs(String query, Object... params)
	{
		return Lists.transform(
			queryColumn(query, params),
			new Function<IValue, Long>()
			{
				@Override
				public Long apply(@Nullable IValue value)
				{
					assert value != null;
					return value.Long();
				}
			}
		);
	}

	@Override
	public List<Double> queryDoubles(String query, Object... params)
	{
		return Lists.transform(
			queryColumn(query, params),
			new Function<IValue, Double>()
			{
				@Override
				public Double apply(@Nullable IValue value)
				{
					assert value != null;
					return value.Double();
				}
			}
		);
	}

	@Override
	public List<Float> queryFloats(String query, Object... params)
	{
		return Lists.transform(
			queryColumn(query, params),
			new Function<IValue, Float>()
			{
				@Override
				public Float apply(@Nullable IValue value)
				{
					assert value != null;
					return value.Float();
				}
			}
		);
	}

	@Override
	public List<DateTime> queryDateTimes(String query, Object... params)
	{
		return Lists.transform(
			queryColumn(query, params),
			new Function<IValue, DateTime>()
			{
				@Override
				public DateTime apply(@Nullable IValue value)
				{
					assert value != null;
					return value.DateTime();
				}
			}
		);
	}

	@Override
	public List<IPlayer> queryPlayers(String query, Object... params)
	{
		return Lists.transform(
			queryColumn(query, params),
			new Function<IValue, IPlayer>()
			{
				@Override
				public IPlayer apply(@Nullable IValue value)
				{
					assert value != null;
					return value.Player();
				}
			}
		);
	}

	@Override
	public List<IWorld> queryWorlds(String query, Object... params)
	{
		return Lists.transform(
			queryColumn(query, params),
			new Function<IValue, IWorld>()
			{
				@Override
				public IWorld apply(@Nullable IValue value)
				{
					assert value != null;
					return value.World();
				}
			}
		);
	}

	@Override
	public List<ILocation> queryLocations(String query, Object... params)
	{
		return Lists.transform(
			query(query, params),
			new Function<IRow, ILocation>()
			{
				@Override
				public ILocation apply(@Nullable IRow row)
				{
					assert row != null;
					return row.Location();
				}
			}
		);
	}

	@Override
	public String queryString(String query, Object... params)
	{
		return queryValue(query, params).String();
	}

	@Override
	public Integer queryInteger(String query, Object... params)
	{
		return queryValue(query, params).Integer();
	}

	@Override
	public Long queryLong(String query, Object... params)
	{
		return queryValue(query, params).Long();
	}

	@Override
	public Double queryDouble(String query, Object... params)
	{
		return queryValue(query, params).Double();
	}

	@Override
	public Float queryFloat(String query, Object... params)
	{
		return queryValue(query, params).Float();
	}

	@Override
	public DateTime queryDateTime(String query, Object... params)
	{
		return queryValue(query, params).DateTime();
	}

	@Override
	public IPlayer queryPlayer(String query, Object... params)
	{
		return queryValue(query, params).Player();
	}

	@Override
	public IWorld queryWorld(String query, Object... params)
	{
		return queryValue(query, params).World();
	}

	@Override
	public ILocation queryLocation(String query, Object... params)
	{
		return queryRow(query, params).Location();
	}
}
